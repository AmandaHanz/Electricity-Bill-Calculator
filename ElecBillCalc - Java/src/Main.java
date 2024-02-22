package SURESH;

import java.time.Year;
import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                double u,D2,D3,D6, d, x,y,y1,y2,y3,y4,z,TC1,TC2,TC3,TC4,total_bill,f1,f2,f3,f4,x1,x2,x3,x4,C,T,unit1,unit2,unit3;


                Scanner units = new Scanner(System.in);
                Scanner days = new Scanner(System.in);


                System.out.println("Enter your units: ");
                u = units.nextDouble();

                System.out.println("Enter your days: ");
                d = days.nextDouble();

                T = 2 * d;

                if (u <= T){
                    if (u >= d){
                        x = d * 8;
                        y = u - d;
                        if (y > 0){
                            f1 = 0;
                        }else{
                            f1 = 120;
                        }
                        x1 = x + f1;
                        y = u - d;
                        if (y == 0){
                            f2 = 0;
                        }else{
                            f2 = 240;
                        }
                        z = y * 10;

                        x2 = z + f2;
                        total_bill = x1 + x2;
                        System.out.println("Total bill: "+total_bill);
                    } else if (u < d) {
                        x3 = u * 8;
                        x4 = x3 + 120;
                        System.out.println("Total bill: "+x4);
                    }
                }else{
                    if (u >= d){
                        D2 = 2 * d;
                        D3 = 3 * d;
                        D6 = 6 * d;
                        unit1 = u - D2;
                        unit2 = u - D3;
                        unit3 = u - D6;
                        if (u < D2){
                            y1 = u * 16;
                            TC1 =y1;
                            System.out.println("Total bill: "+TC1 );
                        } else if (u < D3){
                            y2 = unit1 * 16;
                            y1 = u * 16;
                            f1 = 360;
                            x1 = y1 + y2 + f1;
                            TC2 = x1;
                            System.out.println("Total bill: "+TC2 );
                        } else if (u < D6){
                            y2 = unit1 * 16;
                            y1 = u * 16;
                            y3 = unit2 * 50;
                            f2 = 960;
                            x2 = y1 + y2 + y3 + f2;
                            TC3 = x2;
                            System.out.println("Total bill: "+TC3 );
                        }else if (u > D6) {
                            y2 = unit1 * 16;
                            y1 = u * 16;
                            y3 = unit2 * 50;
                            y4 = unit3 * 75;
                            f3 = 1500;
                            x3 = y1 + y2 + y3 +y4 + f3;
                            TC4 = x3;
                            System.out.println("Total bill: "+TC4);
                        }
                    } else if (u < d) {
                        x3 = u * 16;
                        System.out.println("Total bill: "+x3);
                    }
                }


            }
        }