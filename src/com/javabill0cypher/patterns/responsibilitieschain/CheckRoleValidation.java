package com.javabill0cypher.patterns.responsibilitieschain;

public class CheckRoleValidation extends UserValidation{
    @Override
    public boolean check(Principal principal) {
        return principal.getRole() == UserRole.GUEST || this.checkNext(principal);
    }
}
