public class SearchSample{

public static void main (String[] args){

int [][] list={{1,13,5},{1,2,5},{2,7,2}};
int searchValue=2;
int posX=-1;
int posY=-1;

PARENT_LOOP:for(int i=0;i<list.length;i++){
		for(int j=0;j<list[i].length;j++){
		if(list[i][j]==searchValue){
		posX=i;
		posY=j;
		//break;// PARENT_LOOP;
		
	}}}

	if(posX==-1||posY==-1){
	System.out.println("Search value not found");
	}else{
	System.out.println("x-position: " + posX +'\n'+"y-position: " + posY );
	}

}


}