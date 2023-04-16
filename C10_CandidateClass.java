// 10 Create a class named Candidate with Candidate_ID, candidate_Name, 
// Candidate_Age, Candidate Weight and Candidate_Height data 
// members. Also create a method GetCandidateDetails() and display
// Candidate Details(). Create main method to demonstrate the 
// Candidate class.

class Candidate {
    int Candidate_ID;
    String candidate_Name;
    int Candidate_Age;
    float Candidate_Weight;
    float Candidate_Height;

    public void display() {
        String details = "Candidate ID is: " + Candidate_ID + ".\nCandidate name is " + candidate_Name
                + ".\nCandidate age is " + Candidate_Age + ".\nCandidate weight is " + Candidate_Weight
                + ".\nCandidate height is " + Candidate_Height + ".\n";
        System.out.println(details);
    }

    public String GetCandidateDetails(String s) {
        switch (s) {
            case "id":
                String a = "Cnadidate Details: Candidate id is: " + Candidate_ID;
                return a;
            case "name":
                String b = "Cnadidate Details: Candidate name is: " + candidate_Name;
                return b;
            case "age":
                String c = "Cnadidate Details: Candidate age is: " + Candidate_Age;
                return c;
            case "height":
                String d = "Cnadidate Details: Candidate height is: " + Candidate_Height;
                return d;
            case "weight":
                String e = "Cnadidate Details: Candidate weight is: " + Candidate_Weight;
                return e;
            default:
                String ss = "Cnadidate Details: Not match info.";
                return ss;
        }
    }
}

public class C10_CandidateClass {
    public static void main(String[] args) {
        Candidate c1 = new Candidate();
        c1.Candidate_Age = 34;
        c1.candidate_Name = "Ramesh";
        c1.Candidate_ID = 234;
        c1.Candidate_Height = 156.54f;
        c1.Candidate_Weight = 65.8f;
        System.out.println(c1.GetCandidateDetails("name"));
        System.out.println(c1.GetCandidateDetails("age"));
        c1.display();

        Candidate c2 = new Candidate();
        c2.Candidate_Age = 35;
        c2.candidate_Name = "Dinesh";
        c2.Candidate_ID = 242;
        c2.Candidate_Height = 126.6f;
        c2.Candidate_Weight = 67.2f;
        System.out.println(c2.GetCandidateDetails("id"));
        System.out.println(c2.GetCandidateDetails("weight"));
        c1.display();

    }
}

// Output:
// Cnadidate Details: Candidate name is: Ramesh
// Cnadidate Details: Candidate age is: 34
// Candidate ID is: 234.
// Candidate name is Ramesh.
// Candidate age is 34.
// Candidate weight is 65.8.
// Candidate height is 156.54.

// Cnadidate Details: Candidate id is: 242
// Cnadidate Details: Candidate weight is: 67.2
// Candidate ID is: 234.
// Candidate name is Ramesh.
// Candidate age is 34.
// Candidate weight is 65.8.
// Candidate height is 156.54.