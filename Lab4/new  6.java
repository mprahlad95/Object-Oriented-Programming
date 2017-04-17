class Result
{
 int marks[][]=new int[3][3];
 int total[]=new int[3];

 void storeMarks()
 {
  Scanner input=new Scanner(System.in);
  for(int i=0;i<3;i++)
  for(int j=0;j<3;j++)
  {
   marks[i][j]=input.nextInt();
  }
 }
  
 void storeTotal()
 {
  for(int i=0;i<3;i++)
  for(int j=0;j<3;j++)
    total[i]+=marks[i][j]; 
 }
 
 void displayHighest()
 {
  for(int j=0;j<3;j++)
  {int i=0;
   int gr=marks[i][j];
   for(;i<3;i++)
   {
    if(marks[i][j]
   } 
   System.out.println("Highest marks in Subject"+j+" are "+gr+" by Student"+i);
  }
 }
   
   
   
   
   
   
   
   
   