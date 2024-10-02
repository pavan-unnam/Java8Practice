package innerClass.nested;

public class innerMain {

    public static void main(String args[]) {
        // two way of object creation for inner class

        // separate objects for outer & inner class
        NestedClass nc = new NestedClass();
        NestedClass.innerClass nci = nc.new innerClass ();

        // direct inner object creation
        NestedClass.innerClass ni = new NestedClass().new innerClass ();

        System.out.println(nc.name);
        System.out.println(nc.ACCESS);//static variable should be call with class name
        System.out.println(nc.number);//static variable should be call with class name
        System.out.println(bnc1.naumber1);

        //private variables not accessible the out side class
        System.out.println(nc.nam1);
        System.out.println(nc.ACCESS1);//static variable should be call with class name
        System.out.println(nc.name2);//static variable should be call with class name
        System.out.println(nc.surName);

        //default variables accessible both class packages are different
        System.out.println(nc.lastName);
        System.out.println(nc.name3);//static variable should be call with class name
        System.out.println(nc.name4);//static variable should be call with class name
        System.out.println(nc.name5);

        //protected variables accessible both class packages are different
        System.out.println(nc.name9);
        System.out.println(nc.name6);//static variable should be call with class name
        System.out.println(nc.name7);//static variable should be call with class name
        System.out.println(nc.name8);

        //public methods accessible
        nc.toPrintName();
        nc.toGetData();//static variable should be call with class name
        nc.toGetNa();//static variable should be call with class name
        nc.data();

        //private methods not accessible the out side class
        nc.toGetName();
        nc.toGetCall();//static variable should be call with class name
        nc.toGetPa();//static variable should be call with class name
        nc.dum();

        //default methods accessible both class packages are different
        nc.toFetchName();
        nc.toGet();//static variable should be call with class name
        nc.toGetLa();//static variable should be call with class name
        nc.toRamt();

        //protected methods accessible both class packages are different
        nc.showName();
        nc.toGetDetails();//static variable should be call with class name
        nc.toGetMa();//static variable should be call with class name
        nc.nut();



        System.out.println(nci.name);
        System.out.println(nci.ACCESS);//static variable should be call with class name
        System.out.println(nci.number);//static variable should be call with class name
        System.out.println(bnc1.naumber1);

        //private variables not accessible the out side class
        System.out.println(nci.nam1);
        System.out.println(nci.ACCESS1);//static variable should be call with class name
        System.out.println(nci.name2);//static variable should be call with class name
        System.out.println(nci.surName);

        //default variables accessible both class packages are different
        System.out.println(nci.lastName);
        System.out.println(nci.name3);//static variable should be call with class name
        System.out.println(nci.name4);//static variable should be call with class name
        System.out.println(nci.name5);

        //protected variables accessible both class packages are different
        System.out.println(nci.name9);
        System.out.println(nci.name6);//static variable should be call with class name
        System.out.println(nci.name7);//static variable should be call with class name
        System.out.println(nci.name8);

        //public methods accessible
        nci.toPrintName();
        nci.toGetData();//static variable should be call with class name
        nci.toGetNa();//static variable should be call with class name
        nci.data();

        //private methods not accessible the out side class
        nci.toGetName();
        nci.toGetCall();//static variable should be call with class name
        nci.toGetPa();//static variable should be call with class name
        nci.dum();

        //default methods accessible both class packages are different
        nci.toFetchName();
        nci.toGet();//static variable should be call with class name
        nci.toGetLa();//static variable should be call with class name
        nci.toRamt();

        //protected methods accessible both class packages are different
        nci.showName();
        nci.toGetDetails();//static variable should be call with class name
        nci.toGetMa();//static variable should be call with class name
        nci.nut();

        //anonymus examples
        OuterAnonymousExample out = new OuterAnonymousExample() {
            @Override
            void print() {
                super.print();
            }
        };
        out.print();
    }

}
