package com.training.com.training;

import com.training.ifaces.Conditional;
import com.training.services.MyBusinessService;
import com.training.services.OurBusinessService;

public class Application {

    public static void main(String[] args) {

        MyBusinessService service =
                 new OurBusinessService();

        Conditional studentRef =
                  service.getObject(1);

         service.printResult(studentRef);

        Conditional docRef =
                service.getObject(2);

        service.printResult(docRef);

        Conditional proRef =
                service.getObject(3);

        service.printResult(proRef);


    }
}
