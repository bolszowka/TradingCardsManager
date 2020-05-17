package com.bolszowka.security;

import static com.bolszowka.security.ApplicationUserPermission.CARD_READ;
import static com.bolszowka.security.ApplicationUserPermission.CARD_WRITE;
import static java.util.stream.Collectors.toSet;

import com.google.common.collect.Sets;
import java.util.Set;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

public enum ApplicationUserRole {

    USER(Sets.newHashSet(CARD_READ)),
    ADMIN(Sets.newHashSet(CARD_READ, CARD_WRITE));

    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }

    public Set<ApplicationUserPermission> getPermissions() {
        return permissions;
    }

    public Set<SimpleGrantedAuthority> getGrantedAuthorities() {
        Set<SimpleGrantedAuthority> permissions = getPermissions().stream()
            .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
            .collect(toSet());
        permissions.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
        return permissions;
    }
}
