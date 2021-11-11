package dataaccess;

import javax.persistence.EntityManager;
import models.Role;


public class RoleDB {
    public Role get(String userRole) {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        
        try {
            Role role = em.find(Role.class, userRole);
            return role;
        } finally {
            em.close();
        }
    }
}

