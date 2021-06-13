package com.javabill0cypher.patterns.responsibilitieschain;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ResourcePathValidation extends UserValidation {

    private Map<UserRole, String[]> allowedPaths = new HashMap<>();

    public ResourcePathValidation(Map<UserRole, String[]> allowedPaths) {
        this.allowedPaths = allowedPaths;
    }

    @Override
    public boolean check(Principal principal) {
        return Arrays.stream(allowedPaths.get(principal.getRole())).anyMatch(path -> path.equals(principal.getRequestedResource()));
    }
}
