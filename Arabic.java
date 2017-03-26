/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romannumerals;

/**
 *
 * @author root
 */
public class Arabic extends NumProp implements Number{

    private int m_number;
    
    public Arabic(){}
    
    public Arabic(int n){
        setNumber(n);
        updateProp();
    }
    
    public Arabic(String n){
        setNumber(n);
        updateProp();
    }

    @Override
    public void setNumber(int n) { //sets number if n is arabic
        m_number=n;
        updateProp();
    }
    
    @Override
    public void setNumber (String n){ //sets number if n is roman
        n=n.toUpperCase(); //assures all characters are uppercase
        convert(n); //converts from roman to arabic
        updateProp(); //update number's properties
    }
    
    public void convert(String n) { //converts roman to arabic recursively
        if (n.startsWith("M")) { //M=1000
            m_number+=1000;
            setNumber(n.substring(1, n.length())); //converts substring excluding initial "M"
            return;
        }
        if (n.startsWith("CM")) { //CM=900
            m_number+=900;
            setNumber(n.substring(2, n.length())); //converts substring excluding initial "CM"
            return;
        }
        if (n.startsWith("D")) { //D=500
            m_number+=500;
            setNumber(n.substring(1, n.length())); //converts substring excluding initial "D"
            return;
        }
        if (n.startsWith("CD")) { //CD=400
            m_number+=400;
            setNumber(n.substring(2, n.length())); //converts substring excluding initial "CD"
            return;
        }
        if (n.startsWith("C")) { //C=100
            m_number+=100;
            setNumber(n.substring(1, n.length())); //converts substring excluding initial "C"
            return;
        }
        if (n.startsWith("XC")) { //XC=90
            m_number+=90;
            setNumber(n.substring(2, n.length())); //converts substring excluding initial "XC"
            return;
        }
        if (n.startsWith("L")) { //L=50
            m_number+=50;
            setNumber(n.substring(1, n.length())); //converts substring excluding initial "L"
            return;
        }
        if (n.startsWith("XL")) { //XL=40
            m_number+=40;
            setNumber(n.substring(2, n.length())); //converts substring excluding initial "XL"
            return;
        }
        if (n.startsWith("X")) { //X=10
            m_number+=10;
            setNumber(n.substring(1, n.length())); //converts substring excluding initial "X"
            return;
        }
        if (n.startsWith("IX")) { //IX=9
            m_number+=9;
            setNumber(n.substring(2, n.length())); //converts substring excluding initial "IX"
            return;
        }
        if (n.startsWith("V")) { //V=5
            m_number+=5;
            setNumber(n.substring(1, n.length())); //converts substring excluding initial "V"
            return;
        }
        if (n.startsWith("IV")) { //IV=4
            m_number+=4;
            setNumber(n.substring(2, n.length())); //converts substring excluding initial "IV"
            return;
        }
        if (n.startsWith("I")) { //I=1
            m_number+=1;
            setNumber(n.substring(1, n.length())); //converts substring excluding initial "I"
            return;
        }
    }

    @Override
    public String getNumber() { //returns number as a string
        return Integer.toString(m_number);
    }

    private void updateProp() { //updates number's properties
        if (m_number%2==0) //if rest in division by 2 is 0
            isEven=true;
        else
            isEven=false;
        if (m_number!=2 && isEven) //as number is not 2 and is even, it has to be prime
            isPrime=false;
        else{
            isPrime=true;
            for (int i=m_number-1;i>1;i--){
                if(m_number%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
    }
}
