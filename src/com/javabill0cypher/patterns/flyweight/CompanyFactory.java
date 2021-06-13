package com.javabill0cypher.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CompanyFactory {
    private static Map<String, CompanyType> companies = new HashMap<>();

    public static CompanyType getCompanyByCommons(String name, String city, SellCategory category, CompanyRate rate) {
        CompanyType res = companies.get(name);
        if (Objects.isNull(res)) {
            res = new CompanyType(name, city, category, rate);
            companies.put(name, res);
        }
        return res;
    }
}
