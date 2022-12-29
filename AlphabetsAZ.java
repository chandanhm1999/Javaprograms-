package kodnestStar21;

public class AlphabetsAZ {
    public static void main(String[] args) {
        for(int i=1;i<=11;i++)
        {
            //A
            for(int j=1;j<=11;j++)
            {
                if((i==1&&j!=1&&j!=11)||(j==1&&i!=1&&i!=11)||(j==11&&i!=11&&i!=1)||i==6)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            //B
            System.out.print("   ");
            for(int j=1;j<=11;j++)
            {
                if(i==1&&j<=9||i==11&&j<=9||j==1||i==6&&j<=8||j-i==8||i<7&&i+j==15||i>=7&&j-i==3||j+i==20)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            //C
            System.out.print("   ");
            for(int j=1;j<=11;j++)
            {
                if(i==1||i==11||j==1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            //D
            System.out.print("   ");
            for(int j=1;j<=11;j++)
            {
                if(i==1&&j<=8||i==11&&j<=8||j==1||j-i==7||i+j==19||i==5&&j==11||i==4&&j==11||i==7&&j==11||i==6&&j==11)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            //E
            System.out.print("   ");
            for(int j=1;j<=11;j++)
            {
                if(i==1||i==6||i==11||j==1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            //F
            System.out.print("   ");
            for(int j=1;j<=11;j++)
            {
                if(i==1||i==6||j==1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            //G
            System.out.print("   ");
            for(int j=1;j<=11;j++)
            {
                if((i==1&&j!=1)||(j==1&&i!=1)||j==11&&i>=6||i==11||i==6&&j>5||i==7&&j==6)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            //H
            System.out.print("   ");
            for(int j=1;j<=11;j++)
            {
                if(j==1||j==11||i==6)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            //I
            System.out.print("   ");
            for(int j=1;j<=11;j++)
            {
                if(i==1||i==11||j==6)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            //J
            System.out.print("   ");
            for(int j=1;j<=11;j++)
            {
                if(i==1||i==11&&j<=6||j==6||i>=9&&j==1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            //K
            System.out.print("   ");
            for(int j=1;j<=11;j++)
            {
                if(j==1||i<=6&&i+j==12||i>=6&&i==j)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            //L
            System.out.print("   ");
            for(int j=1;j<=11;j++)
            {
                if(j==1||i==11)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            //M
            System.out.print("   ");
            for(int j=1;j<=11;j++)
            {
                if(j==1||j==11||i<=6&&i==j||i<=6&&i+j==12)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            //N
            System.out.print("   ");
            for(int j=1;j<=11;j++)
            {
                if(j==1||j==11||i==j)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            //O
            System.out.print("   ");
            for(int j=1;j<=11;j++)
            {
                if((i==1&&j!=1&&j!=11)||(j==1&&i!=1&&i!=11)||(i==11&&j!=11&&j!=1)||(j==11&&i!=11&&i!=1))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1;i<=11;i++)
        {
            //P
            for(int j=1;j<=11;j++)
            {
                if(j==1||i==1||i<=6&&j==11||i==6)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            //Q
            System.out.print("   ");
            for(int j=1;j<=11;j++)
            {
                if((i==1&&j!=1&&j!=11)||(j==1&&i!=1&&i!=11&&i!=10)||(i==10&&j!=11&&j!=1)||(j==11&&i!=11&&i!=1&&i!=10)||(i==11&&j==10))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            //R
            System.out.print("   ");
            for(int j=1;j<=11;j++)
            {
                if((i==1&&j!=1&&j!=11)||(j==1&&i!=1)||(j==11&&i!=11&&i!=1&&i<=6||i==6||i-j==4))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            //S
            System.out.print("   ");
            for(int j=1;j<=11;j++)
            {
                if(i==1||i==11||i==6||i<=6&&j==1||i>=6&&j==11)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            //T
            System.out.print("   ");
            for(int j=1;j<=11;j++)
            {
                if(i==1||j==6)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            //U
            System.out.print("   ");
            for(int j=1;j<=11;j++)
            {
                if(i==11||j==1||j==11)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            //V
            System.out.print("   ");
            for(int j=1;j<=11;j++)
            {
                if(i<=6&&j==1||i<=6&&j==11||i-j==5||i+j==17)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            //W
            System.out.print("   ");
            for(int j=1;j<=11;j++)
            {
                if(j==1||j==11||i>=6&&i==j||i>=6&&i+j==12)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            //X
            System.out.print("   ");
            for(int j=1;j<=11;j++)
            {
                if(i==j||i+j==12)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            //Y
            System.out.print("   ");
            for(int j=1;j<=11;j++)
            {
                if(i<=6&&i==j||i+j==12)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");
            for(int j=1;j<=11;j++)
            {
                if(i==1||i==11||i+j==12)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        }
}
