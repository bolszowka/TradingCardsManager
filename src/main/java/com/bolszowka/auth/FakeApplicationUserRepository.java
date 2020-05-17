package com.bolszowka.auth;

import static com.bolszowka.security.ApplicationUserRole.ADMIN;
import static com.bolszowka.security.ApplicationUserRole.USER;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

@Repository("fake")
@RequiredArgsConstructor
public class FakeApplicationUserRepository implements ApplicationUserRepository { //TODO remove and change by real repo

    private final PasswordEncoder passwordEncoder;

    @Override
    public Optional<ApplicationUser> findByUsername(String username) {
        return getApplicationUsers().stream()
            .filter(applicationUser -> username.equals(applicationUser.getUsername()))
            .findFirst();
    }

    private List<ApplicationUser> getApplicationUsers() {
        return Lists.newArrayList(
            new ApplicationUser(
                "user",
                passwordEncoder.encode("user"),
                USER.getGrantedAuthorities(),
                true,
                true,
                true,
                true
            ),
            new ApplicationUser(
                "admin",
                passwordEncoder.encode("admin"),
                ADMIN.getGrantedAuthorities(),
                true,
                true,
                true,
                true
            )
        );
    }
}
