package odev;

import java.util.Scanner;

import java.util.Random;

public class odev {

	public static void main(String[] args) {
		Random random = new Random();

		// odev-1
		/*
		int[][] dizi = new int[3][3];

		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi[i].length; j++) {
				dizi[i][j] = (int) (Math.random() * 10);
			}
		}

		System.out.println("Matrisin normal hali: ");
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi[i].length; j++) {
				System.out.print(dizi[i][j] + " ");
			}
			System.out.println();
		}

		int temp;
		
		for (int i = 0; i < dizi.length; i++) {
		    for (int j = 0; j < dizi[i].length - 1; j++) {
		        for (int k = 0; k < dizi[i].length - j - 1; k++) {
		            if (dizi[i][k] > dizi[i][k + 1]) {
		                temp = dizi[i][k];
		                dizi[i][k] = dizi[i][k + 1];
		                dizi[i][k + 1] = temp;
		            }
		        }
		    }
		}
		

		System.out.println("Matrisin sıralanmış hali: ");
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi[i].length; j++) {
				System.out.print(dizi[i][j] + " ");
			}
			System.out.println();
		}
		*/
		
		
		
		// odev-2
		int temp;
		int min = 1;
		int max = 4;
		int randomrakam = random.nextInt(max - min + 1) + min;
		int boyut1 = random.nextInt(max - min + 1) + min;
		int boyut2 = random.nextInt(max - min + 1) + min;
		int boyut3 = random.nextInt(max - min + 1) + min;
		int boyut4 = random.nextInt(max - min + 1) + min;
		
		
		switch (randomrakam)  {
		case 1:
			System.out.println("1 boyutlu dizi: ");
			int dizi[] = new int[boyut1];
			int dizi12[] = new int[boyut1];
			
			for (int i=0; i< dizi.length; i++) {
				dizi[i] = (int) (Math.random() * 10);
			}
			
			for (int i=0; i< dizi12.length; i++) {
				dizi12[i] = (int) (Math.random() * 10);
			}
			
			for (int i = 0; i < dizi.length - 1; i++) {
			    for (int j = 0; j < dizi.length - i - 1; j++) {
			        if (dizi[j] > dizi[j + 1]) {
			            temp = dizi[j];
			            dizi[j] = dizi[j + 1];
			            dizi[j + 1] = temp;
			        }
			    }
			}
			
			for (int i = 0; i < dizi12.length - 1; i++) {
			    for (int j = 0; j < dizi12.length - i - 1; j++) {
			        if (dizi12[j] > dizi12[j + 1]) {
			            temp = dizi12[j];
			            dizi12[j] = dizi12[j + 1];
			            dizi12[j + 1] = temp;
			        }
			    }
			}
			
			
			for (int i=0; i< dizi.length; i++) {
				System.out.print(dizi[i] + " ");
			}
			System.out.println();
			
			for (int i=0; i< dizi12.length; i++) {
				System.out.print(dizi12[i] + " ");
			}
			

			int toplam = 0;
			for (int i=0; i< dizi.length; i++) {
				for (int j = 0; j < dizi12.length; j++) {
					toplam += dizi[i] * dizi12[j];
				}
			}
			
			System.out.println();
			System.out.println("Toplam: " + toplam);
			
			break;
		case 2:
			System.out.println("2 boyutlu dizi: ");
			
			
			int dizi2[][] = new int[boyut1][boyut2];
			int dizi22[][] = new int[boyut1][boyut2];
			
			for (int i = 0; i < dizi2.length; i++) {
				for (int j = 0; j < dizi2[i].length; j++) {
					dizi2[i][j] = (int) (Math.random() * 10);
				}
			}
			
			for (int i = 0; i < dizi22.length; i++) {
				for (int j = 0; j < dizi22[i].length; j++) {
					dizi22[i][j] = (int) (Math.random() * 10);
				}
			}
			
			
			
			
			
			
			for (int i = 0; i < dizi2.length; i++) {
			    for (int j = 0; j < dizi2[i].length - 1; j++) {
			    	for (int k= 0; k<dizi2[i].length -j-1; k++) {
			    		if (dizi2[i][k] > dizi2[i][k + 1]) {
			                temp = dizi2[i][k];
			                dizi2[i][k] = dizi2[i][k + 1];
			                dizi2[i][k + 1] = temp;
			            }
			    	}
			    	
			    }
			}
			
			for (int i = 0; i < dizi22.length; i++) {
			    for (int j = 0; j < dizi22[i].length - 1; j++) {
			    	for (int k= 0; k<dizi22[i].length -j-1; k++) {
			    		if (dizi22[i][k] > dizi22[i][k + 1]) {
			                temp = dizi22[i][k];
			                dizi22[i][k] = dizi22[i][k + 1];
			                dizi22[i][k + 1] = temp;
			            }
			    	}
			    	
			    }
			}
			
			
			for (int i = 0; i < dizi2.length; i++) {
				for (int j = 0; j < dizi2[i].length; j++) {
					System.out.print(dizi2[i][j] + " ");
				}
				System.out.println();
			}
			
			System.out.println();
			
			for (int i = 0; i < dizi22.length; i++) {
				for (int j = 0; j < dizi22[i].length; j++) {
					System.out.print(dizi22[i][j] + " ");
				}
				System.out.println();
			}
			
			toplam = 0;
			
			for (int i =0; i<dizi2.length; i++) {
				for (int j =0; j<dizi2[i].length; j++) {
					for (int k =0; k<dizi22.length; k++) {
						for (int l =0; l<dizi22[k].length; l++) {
							toplam += dizi2[i][j] * dizi22[k][l];
						}
					}
				}
			}

			System.out.println("Toplam: " + toplam);
			
			
			break;
		case 3:
			System.out.println("3 boyutlu dizi: ");
			int dizi3[][][] = new int[boyut1][boyut2][boyut3];
			int dizi32[][][] = new int[boyut1][boyut2][boyut3];
			
			for (int i = 0; i < dizi3.length; i++) {
				for (int j = 0; j < dizi3[i].length; j++) {
					for (int k = 0; k<dizi3[i][j].length; k++) {
						dizi3[i][j][k] = (int) (Math.random() * 10);
					}
				}
			}
			
			
			for (int i = 0; i < dizi3.length; i++) {
			    for (int j = 0; j < dizi3[i].length; j++) {
			        for (int k = 0; k < dizi3[i][j].length - 1; k++) {
			            for (int l = 0; l < dizi3[i][j].length - k - 1; l++) {
			                if (dizi3[i][j][l] > dizi3[i][j][l + 1]) {
			                    temp = dizi3[i][j][l];
			                    dizi3[i][j][l] = dizi3[i][j][l + 1];
			                    dizi3[i][j][l + 1] = temp;
			                }
			            }
			        }
			    }
			}
			
			for (int i = 0; i < dizi3.length; i++) {
				for (int j = 0; j < dizi3[i].length; j++) {
					for (int k = 0; k<dizi3[i][j].length; k++) {
						System.out.print(dizi3[i][j][k] + " ");
					}
					System.out.println();
				}
			    System.out.println();

			}
			
			 System.out.println("-----------------------------------");
			 
			 for (int i = 0; i < dizi32.length; i++) {
					for (int j = 0; j < dizi32[i].length; j++) {
						for (int k = 0; k<dizi32[i][j].length; k++) {
							dizi32[i][j][k] = (int) (Math.random() * 10);
						}
					}
				}
				
				
				for (int i = 0; i < dizi32.length; i++) {
				    for (int j = 0; j < dizi32[i].length; j++) {
				        for (int k = 0; k < dizi32[i][j].length - 1; k++) {
				            for (int l = 0; l < dizi32[i][j].length - k - 1; l++) {
				                if (dizi32[i][j][l] > dizi32[i][j][l + 1]) {
				                    temp = dizi32[i][j][l];
				                    dizi32[i][j][l] = dizi32[i][j][l + 1];
				                    dizi32[i][j][l + 1] = temp;
				                }
				            }
				        }
				    }
				}
				
				for (int i = 0; i < dizi32.length; i++) {
					for (int j = 0; j < dizi32[i].length; j++) {
						for (int k = 0; k<dizi32[i][j].length; k++) {
							System.out.print(dizi32[i][j][k] + " ");
						}
						System.out.println();
					}
				    System.out.println();

				}
				
				toplam = 0;
				
				for (int i = 0; i < dizi3.length; i++) {
					for (int j = 0; j < dizi3[i].length; j++) {
						for (int k = 0; k<dizi3[i][j].length; k++) {
							for (int l = 0; l < dizi32.length; l++) {
								for (int m = 0; m < dizi32[l].length; m++) {
									for (int s = 0; s<dizi32[l][m].length; s++) {
										toplam += dizi3[i][j][k] * dizi32[l][m][s];
									}
								}
							}
						}
					}
				}
				
				System.out.println("Toplam: " + toplam);
				
			
			
			
			
			break;
		case 4:
			System.out.println("4 boyutlu dizi: ");
			int dizi4[][][][] = new int[boyut1][boyut2][boyut3][boyut4];
			int dizi42[][][][] = new int[boyut1][boyut2][boyut3][boyut4];
			
			for (int i = 0; i < dizi4.length; i++) {
				for (int j = 0; j < dizi4[i].length; j++) {
					for (int k = 0; k<dizi4[i][j].length; k++) {
						for (int p = 0; p<dizi4[i][j][k].length; p++) {
							dizi4[i][j][k][p] = (int) (Math.random() * 10);
						}
					}
				}
			}
			
			for (int i = 0; i < dizi42.length; i++) {
				for (int j = 0; j < dizi42[i].length; j++) {
					for (int k = 0; k<dizi42[i][j].length; k++) {
						for (int p = 0; p<dizi42[i][j][k].length; p++) {
							dizi42[i][j][k][p] = (int) (Math.random() * 10);
						}
					}
				}
			}
			
			
			for (int i = 0; i < dizi4.length; i++) {
			    for (int j = 0; j < dizi4[i].length; j++) {
			        for (int k = 0; k < dizi4[i][j].length; k++) {
			            for (int p = 0; p < dizi4[i][j][k].length - 1; p++) {
			                for (int l = 0; l < dizi4[i][j][k].length - p - 1; l++) {
			                    if (dizi4[i][j][k][l] > dizi4[i][j][k][l + 1]) {
			                        temp = dizi4[i][j][k][l];
			                        dizi4[i][j][k][l] = dizi4[i][j][k][l + 1];
			                        dizi4[i][j][k][l + 1] = temp;
			                    }
			                }
			            }
			        }
			    }
			}
			
			
			for (int i = 0; i < dizi42.length; i++) {
			    for (int j = 0; j < dizi42[i].length; j++) {
			        for (int k = 0; k < dizi42[i][j].length; k++) {
			            for (int p = 0; p < dizi42[i][j][k].length - 1; p++) {
			                for (int l = 0; l < dizi42[i][j][k].length - p - 1; l++) {
			                    if (dizi42[i][j][k][l] > dizi42[i][j][k][l + 1]) {
			                        temp = dizi42[i][j][k][l];
			                        dizi42[i][j][k][l] = dizi42[i][j][k][l + 1];
			                        dizi42[i][j][k][l + 1] = temp;
			                    }
			                }
			            }
			        }
			    }
			}

			
			
			
			 
			
			for (int i = 0; i < dizi4.length; i++) {
				for (int j = 0; j < dizi4[i].length; j++) {
					for (int k = 0; k<dizi4[i][j].length; k++) {
						for (int p = 0; p<dizi4[i][j][k].length; p++) {
							System.out.print(dizi4[i][j][k][p] + " ");
						}
						System.out.println();
					}
					System.out.println();
				}
				System.out.println();
			}
			
			System.out.println("-----------------------------------");
			
			for (int i = 0; i < dizi42.length; i++) {
				for (int j = 0; j < dizi42[i].length; j++) {
					for (int k = 0; k<dizi42[i][j].length; k++) {
						for (int p = 0; p<dizi42[i][j][k].length; p++) {
							System.out.print(dizi42[i][j][k][p] + " ");
						}
						System.out.println();
					}
					System.out.println();
				}
				System.out.println();
			}
			
			toplam = 0;
			
			for (int i = 0; i < dizi4.length; i++) {
				for (int j = 0; j < dizi4[i].length; j++) {
					for (int k = 0; k<dizi4[i][j].length; k++) {
						for (int p = 0; p<dizi4[i][j][k].length; p++) {
							for (int r = 0;  r< dizi42.length; r++) {
								for (int t = 0; t < dizi42[r].length; t++) {
									for (int y = 0; y<dizi42[r][t].length; y++) {
										for (int u = 0; u<dizi42[r][j][y].length; u++) {
											toplam += dizi4[i][j][k][p] * dizi42[r][t][y][u];
										}
									}
								}
							}
						}
					}
				}
			}

			System.out.println("Toplam: " + toplam);
			
			break;
			
		}
		
		
		
		

	}

}
