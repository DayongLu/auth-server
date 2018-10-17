package com.paradyme.security.authserver;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AccountUserDetailsService implements UserDetailsService {

    private final AccountRepository accountRepository;

    public AccountUserDetailsService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {


        return accountRepository.findByUsername(s).map(account ->
                new User(account.getUsername(),
                        account.getPassword(),
                        account.isEnable(),
                        account.isAccountNonExpired(),
                        account.isCredentialsNonExpired(),
                        account.isAccountNonLocked(),
                        AuthorityUtils.createAuthorityList(account.getAuthorities().split(","))))
                .orElseThrow(() -> new UsernameNotFoundException("Could not find the username" + s + "!"));
    }
}
