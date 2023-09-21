package intuit.smallbiz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Company {
    private String companyName;
    private String companyType;
    private String companyAddress;
    private List<Company> relations = new ArrayList<>();

    public Company(String companyName, String companyAddress) {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public List<Company> getRelations() {
        return relations;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public void setRelations(List<Company> relations) {
        this.relations = relations;
    }

    public void addRelation(Company company) {
        this.relations.add(company);
    }

//    public int getDegreeOfSeparation(Company company) {
//        int deg = 0;
//        Queue<Company> companyQueue = new LinkedList<>();
//        HashSet<String> visitedCompanies = new HashSet<>();
//
//        companyQueue.addAll(this.getRelations());
//
//        while(!companyQueue.isEmpty()) {
//            int size = companyQueue.size(); // Record the size before we add more
//            for(int counter=0; counter < size; counter++) {
//                Company thisCompany = companyQueue.remove();
//                if(thisCompany.getCompanyName().equals(company.getCompanyName())) {
//                    return deg;
//                }
//                if(visitedCompanies.contains(thisCompany.getCompanyName())) {
//                    continue;
//                }
//                visitedCompanies.add(thisCompany.getCompanyName());
//                companyQueue.addAll(thisCompany.getRelations());
//            }
//            deg++;
//        }

//        return -1; // Relation not found
//
//    }


    public int getDegreeOfSeparation(Company company) {
        int result = 0;
        LinkedList<Company> queueCompanies = new LinkedList<>();
        queueCompanies.addAll(this.getRelations());
        while(!queueCompanies.isEmpty()) {
            int size = queueCompanies.size();
            for (int count = 0 ; count < size; count++) {
                Company queueCompany = queueCompanies.remove();
                if (queueCompany.getCompanyName().equalsIgnoreCase(company.getCompanyName())) {
                    return result;
                } else {
                    queueCompanies.addAll(queueCompany.getRelations());
                }
            }
            result++;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                '}';
    }
}
