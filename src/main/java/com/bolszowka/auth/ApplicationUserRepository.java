package com.bolszowka.auth;

import java.util.Optional;

public interface ApplicationUserRepository {

    Optional<ApplicationUser> findByUsername(String username);
}