package com.company;

public class Main {

    public static void main(String[] args) {
	int salary1=1000;
	int salary2=1000;
	int salary3=1200;
	if(salary1>salary2 && salary2>salary3){
        System.out.println("Разность = " + (salary1-salary3));
    }
	else {
	    if (salary1>salary3 && salary3>salary2){
            System.out.println("Разность = " + (salary1-salary2));
        }
	    else{
	        if(salary2>salary1 && salary1>salary3){
                System.out.println("Разность = " + (salary2-salary3));
            }
	        else{
	            if (salary2>salary3 && salary3>salary1){
                    System.out.println("Разность = " + (salary2-salary1));
                }
	            else{
	                if (salary3>salary1 && salary1>salary2){
                        System.out.println("Разность = " + (salary3-salary2));
                    }
	                else{
	                    if (salary3>salary2 && salary2>salary1){
                            System.out.println("Разность = " + (salary3-salary1));
                        }
	                    if (salary1==salary2 && salary2>salary3){
                            System.out.println("Разность = " + (salary1-salary3));
                        }
	                    else{
	                        if (salary1==salary3 && salary1>salary2){
                                System.out.println("Разность = " + (salary1-salary2));
                            }
	                        else{
	                            if (salary2==salary3 && salary2>salary1){
                                    System.out.println("Разность = " + (salary2-salary1));
                                }
	                            else{
                                    if (salary1 == salary2 && salary3 > salary2) {
                                        System.out.println("Разность = " + (salary3-salary1));
                                    }
                                    else{
                                        if (salary1==salary3 && salary2>salary3){
                                            System.out.println("Разность = " + (salary2-salary3));
                                        }
                                        else {
                                            if (salary2==salary3 && salary1>salary2){
                                                System.out.println("Разность = " + (salary1-salary2));
                                            }
                                        }
                                    }
                                }


                            }
                        }
                    }
                }
            }
        }
    }
    }
}
