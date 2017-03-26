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
public class Roman extends NumProp implements Number{

    private String m_number;
    
    public Roman(){}
    
    public Roman(String n){
        setNumber(n);
        updateProp();
    }
    
    public Roman(int n) {
        setNumber(n);
        updateProp();
    }
    
    @Override
    public void setNumber(String n) {
        m_number=n;
        updateProp();
    }

    @Override
    public void setNumber(int n) { //decrements number from bigger to smaller values
        m_number="";
        while (n>=1000) {
            m_number+="M";
            n-=1000;
        }
        while (n>=900) {
            m_number+="CM";
            n-=900;
        }
        while (n>=500) {
            m_number+="D";
            n-=500;
        }
        while (n>=400) {
            m_number+="CD";
            n-=400;
        }
        while (n>=100) {
            m_number+="C";
            n-=100;
        }
        while (n>=90) {
            m_number+="XC";
            n-=90;
        }
        while (n>=50) {
            m_number+="L";
            n-=50;
        }
        while (n>=40) {
            m_number+="XL";
            n-=40;
        }
        while (n>=10) {
            m_number+="X";
            n-=10;
        }
        while (n>=9) {
            m_number+="IX";
            n-=9;
        }
        while (n>=5) {
            m_number+="V";
            n-=5;
        }
        while (n>=4) {
            m_number+="IV";
            n-=4;
        }
        while (n>=1) {
            m_number+="I";
            n-=1;
        }
    }

    @Override
    public String getNumber() {
        return m_number;
    }

    private void updateProp() { //translates roman to arabic in order to compute its properties
        Arabic temp=new Arabic(m_number); //Arabic class converts number to arabic notation
        int n=Integer.parseInt(temp.getNumber()); //gets number converted
        if (n%2==0) //if rest in division by 2 is 0
            isEven=true;
        else
            isEven=false;
        if (n!=2 && isEven) //as number is not 2 and is even, it has to be prime
            isPrime=false;
        else{
            isPrime=true;
            for (int i=n-1;i>1;i--){
                if(n%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
    }
    
};
