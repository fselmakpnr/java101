package mayintarlasi;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Minefield {

	int row;
	int col;
	int [][] map;
	int [][] board;
	int size;
	int success=0;
	boolean game=true;
	
	public Minefield(int row,int col)
	{
		this.row=row;
		this.col=col;
		this.map=new int[row][col];
		this.board=new int[row][col];
		this.size=row*col;
		
		 for (int i = 0; i < row; i++) {
	            for (int j = 0; j < col; j++) {
	                board[i][j] = -2;
	            }
	        }
		
	}
	Scanner scan=new Scanner(System.in);
	Random rand=new Random();
	
	public void run() 
	{
	    System.out.println("-Mayınların Konumu-");
	    prepareGame();
	    print(map);
	    System.out.println("-Oyun Başladı-");

	    while (game) {
	        print(board);

	        int rowNumber = -1, colNumber = -1;
	        boolean validInput = false;

	        
	        while (!validInput) {
	           
	        	System.out.println("Satır giriniz:");
	            rowNumber = scan.nextInt();
	            System.out.println("Sütun giriniz:");
	            colNumber = scan.nextInt();

	           
	            if (rowNumber < 0 || rowNumber >= row || colNumber < 0 || colNumber >= col) 
	            {
	                System.out.println("Geçersiz koordinat! Lütfen oyun alanı sınırları içinde bir koordinat giriniz.");
	            }
	            
	            else if (board[rowNumber][colNumber] != -2) 
	            {  
	                System.out.println("Bu koordinat daha önce seçildi, başka bir koordinat girin.");
	            } 
	            else 
	            {
	                validInput = true; 
	            }
	        }

	        if (map[rowNumber][colNumber] != -1) 
	        {
	            check(rowNumber, colNumber);
	            if (success == (size - (size / 4))) 
	            {
	                System.out.println("Başarılı.");
	                break;
	            }
	        } 
	        else 
	        {
	            game = false;
	            System.out.println("Game Over!");
	        }
	    }
	}
	
	public void prepareGame()
	{
		int randRow,randCol,count=0;
		
		while(count!=(size/4))
		{
			randRow=rand.nextInt(row);
			randCol=rand.nextInt(col);
			if(map[randRow][randCol]!=-1)
			{
				map[randRow][randCol]=-1;
				count++;
			}
		}
		
		
	}
	public void print(int[][] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				if(arr[i][j]==-1)
				{
					System.out.print(" * ");
				}
				
				else if(arr[i][j] == -2)  
	            {
	                System.out.print(" - ");
	            }
	            else 
	            {
	                if(arr[i][j] >= 0)
	                {
	                    System.out.print(" ");
	                }
	                System.out.print(arr[i][j] + " ");
	            }
			}
			System.out.println("");
		}
	}
	
	public void check(int r, int c) {
	    if (board[r][c] == -2) 
	    { 
	        int count = 0;

	        
	        if ((c < col - 1) && (map[r][c + 1] == -1)) {
	            count++;
	        }
	        
	        if ((r < row - 1) && (map[r + 1][c] == -1)) {
	            count++;
	        }
	      
	        if ((r > 0) && (map[r - 1][c] == -1)) {
	            count++;
	        }
	        
	        if ((c > 0) && (map[r][c - 1] == -1)) {
	            count++;
	        }
	      
	        if ((r < row - 1) && (c < col - 1) && (map[r + 1][c + 1] == -1)) {
	            count++;
	        }
	        
	        if ((r > 0) && (c < col - 1) && (map[r - 1][c + 1] == -1)) {
	            count++;
	        }
	        
	        if ((r < row - 1) && (c > 0) && (map[r + 1][c - 1] == -1)) {
	            count++;
	        }
	        
	        if ((r > 0) && (c > 0) && (map[r - 1][c - 1] == -1)) {
	            count++;
	        }

	        board[r][c] = count; 
	        success++; 

	        if (count == 0) 
	        { 
	            
	            if ((c < col - 1) && (board[r][c + 1] == -2)) {
	                check(r, c + 1);
	            }
	            
	            if ((r < row - 1) && (board[r + 1][c] == -2)) {
	                check(r + 1, c);
	            }
	            
	            if ((r > 0) && (board[r - 1][c] == -2)) {
	                check(r - 1, c);
	            }
	            
	            if ((c > 0) && (board[r][c - 2] == -2)) {
	                check(r, c - 1);
	            }
	            
	            if ((r < row - 1) && (c < col - 1) && (board[r + 1][c + 1] == -2)) {
	                check(r + 1, c + 1);
	            }
	           
	            if ((r > 0) && (c < col - 1) && (board[r - 1][c + 1] == -2)) {
	                check(r - 1, c + 1);
	            }
	            
	            if ((r < row - 1) && (c > 0) && (board[r + 1][c - 1] == -2)) {
	                check(r + 1, c - 1);
	            }
	            
	            if ((r > 0) && (c > 0) && (board[r - 1][c - 1] == -2)) {
	                check(r - 1, c - 1);
	            }
	        }
	    }
	}

  }


	
	

