public class Arrays
{
	
	public static void main(String[] args)
	{
		double[][][][][][][][][][][] thing = new double[10][10][10][10][10][10][10][10][10][10][10];
		for (int a = 1; a <= 10; a++)
		{
			for (int b = 1; b <= 10; b++)
			{
				for (int c = 1; c <= 10; c++)
				{
					for (int d = 1; d <= 10; d++)
					{
						for (int e = 1; e <= 10; e++)
						{
							for (int f = 1; f <= 10; f++)
							{
								for (int g = 1; g <= 10; g++)
								{
									for (int h = 1; h <= 10; h++)
									{
										for (int i = 1; i <= 10; i++)
										{
											for (int j = 1; j <= 10; j++)
											{
												for (int k = 1; k <= 10; k++)
												{
													thing[a][b][c][d][e][f][g][h][i][j][k] = a + b + c + d + e + f + g
															+ h + i + j + k;
													System.out.println(thing[a][b][c][d][e][f][g][h][i][j][k]);
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
