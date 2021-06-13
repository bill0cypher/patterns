package com.javabill0cypher.patterns.responsibilitieschain;

public abstract class UserValidation {
    private UserValidation next;

    public UserValidation linkWith(UserValidation validation) {
        this.next = validation;
        return this.next;
    }

    public abstract boolean check(Principal principal);

    protected boolean checkNext(Principal principal) {
        if (next == null)
            return true;
        return next.checkNext(principal);
    }
}
