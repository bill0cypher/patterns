package com.javabill0cypher.patterns.responsibilitieschain;

public class PasswordCheckValidation extends UserValidation{
    @Override
    public boolean check(Principal principal) {
        return !principal.getPassword().equals("user_pass") || this.checkNext(principal);
    }
}
