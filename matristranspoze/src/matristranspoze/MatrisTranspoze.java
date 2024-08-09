package matristranspoze;

public class MatrisTranspoze {

	public static void main(String[] args) {
		int matris[][]=
		{
				{1,2,3},
				{4,5,6}
		};
			
			System.out.println("Matrisin Kendisi ");
			for(int i=0;i<matris.length;i++)
			{
				for(int j=0;j<matris[i].length;j++)
				{
					System.out.print(matris[i][j] + " ");
				}
				System.out.println(" ");
			}
			
			System.out.println("Matrisin Transpozesi ");
			
			for(int j=0;j<matris[0].length;j++)
			{
				for(int i=0;i<matris.length;i++)
				{
					System.out.print(matris[i][j] + " ");
				}
				System.out.println();
			}
			
	}

}
