class Test{
     public static void main(String[] args){
         int[] eids={101,102,103,104,105,106,107,108,109,110};
           /* for(int i=0; i<=6; i++){            //for loop
          System.out.println(eids[i]);
            }*/


          /* int i=0;
           while(i<=6){                           //while loop
            System.out.println(eids[i]);
            i++;
           }*/

         /* int i=0;
          do{
            System.out.println(eids[i]);             //do while loop

            i++; 
          }while(i<=6);*/

          /*for(int eid : eids){                     //for each loop
             System.out.println(eid);

          }*/


         for(int i=0; i<=eids.length-1; i++){                           //eids length
            System.out.println(eids[i]);
         }
     }
}