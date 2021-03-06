package com.company;

import java.util.Date;

/**
 * Created by a1 on 28.06.16.
 */
public class Shedule_thr extends Thread {

    public Shedule_thr(){
        super();
        setDaemon(true);
    }

    @Override
    public void run() {
        Date curDate = null;

        while(true) {
            curDate = new Date(System.currentTimeMillis());
            for (int i = 0; i < Global.users.size(); i++)
                if (Global.users.get(i).getStatus())
                    for (int j = 0; j < Global.users.get(i).sizeEvents(); j++)
                        if ((Global.users.get(i).getEvent(j).getDate().getTime() < (curDate.getTime()+250)) &&
                            (Global.users.get(i).getEvent(j).getDate().getTime() > (curDate.getTime()-250)))
                        {
                            System.out.println("!!!!!!!!!!!!!!!!!!!");
                            System.out.println(curDate.toString() + "\n" +
                                    Global.users.get(i).getName() + "\n" +
                                    Global.users.get(i).getEvent(j).getInfo());
                            System.out.println("!!!!!!!!!!!!!!!!!!!");
                        }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
