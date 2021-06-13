package com.javabill0cypher.patterns.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Marketplace {
    private List<Company> companies = new ArrayList<>();
    public Company buildNewCompany(
            boolean promActive,
            Integer annualIncome,
            String name,
            String city,
            SellCategory category,
            CompanyRate rate ) {
        CompanyType type = CompanyFactory.getCompanyByCommons(name, city, category, rate);
        return new Company(promActive, annualIncome, type);
    }

    public List<Company> getCompanies() {
        return companies;
    }
}
