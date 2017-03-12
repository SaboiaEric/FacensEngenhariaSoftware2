package model;
public class AnoBissexto {
    public boolean calculaAnoBissexto(int ano){
        if(ano % 400 == 0)
            return true;
        else if(ano % 4 == 0){
        	if(ano % 100 != 0)
        		return true;
        	else
        		return false;
        }
        else
            return false;
    }
}