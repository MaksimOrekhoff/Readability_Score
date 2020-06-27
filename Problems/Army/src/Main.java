class Army {
    static Unit[] unit = new Unit[5];
    static Knight[] knight = new Knight[3];
    static General general;
    static Doctor doctor;

    public static void createArmy() {
        general = new General("General");
        doctor = new Doctor("Doctor");
        for (int i = 0; i < 5; i++) {
            unit[i] = new Unit("Unit" + i);
        }
        for (int i = 0; i < 3; i++) {
            knight[i] = new Knight("Knight" + i);
        }

    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}