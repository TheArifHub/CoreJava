package Inheritance.MultiLevelIheritance;

class University {
    void board() {
        System.out.println("VTU Board");
    }
}

class College extends University {
    // board();

    void admision() {
        System.out.println("CIT college");
    }
}

class Branch extends College {
    // board();
    // admission();

    void department() {
        System.out.println("Mechanical Engineering");
    }

}

public class Student {
    public static void main(String[] args) {
        Branch branch = new Branch();
        branch.board();
        branch.admision();
        branch.department();
    }
}
