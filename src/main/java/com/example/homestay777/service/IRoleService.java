package com.example.homestay777.service;

import com.example.homestay777.model.Role;
import com.example.homestay777.model.User;

import java.util.List;

/**
 * @author Simpson Alfred
 */

public interface IRoleService {
    List<Role> getRoles();
    Role createRole(Role theRole);

    void deleteRole(Long id);
    Role findByName(String name);

    User removeUserFromRole(Long userId, Long roleId);
    User assignRoleToUser(Long userId, Long roleId);
    Role removeAllUsersFromRole(Long roleId);
}
