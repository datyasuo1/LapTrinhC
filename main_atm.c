#include <stdio.h>
    int so_du=90000000, count; 
    char ans='y';
	login(int username, int password)
	{
		printf("chao mung den voi abank\n");
		do{
		printf("moi ban nhap ma the\n");
		scanf("%d", &username);
		if(username==1234)
		{
		printf("so tk chinh xac:\n ");
		}
		else{
			printf("so tai khoan sai\n");
		}
	}while(username!=1234 );
	
	do{
		printf("moi ban nhap pass\n");
		scanf("%d", &password);
		if(password==4321)
		{
			printf("password chinh xac\n");
		}
		else
		{
			printf("pass sai\n");
			
		}
	}while(password!=4321);
}



	withdraw (int num)
	{
		printf("xin nhap so tien can rut\n");
		scanf("%d", &num);
		if(num%50==0 && num<3000000 && num<=so_du )
		printf("so tien con lai la %d\n", so_du-num);
		else
		printf("so tien ko hop le");
	}
	
	transfer(int id, int num1)
	{
		printf("nhap tai khoan va so tien muon chuyen\n");
		scanf("%d", &id);
		scanf("%d", &num1);
		printf("chuyen tien thanh cong tai khoan con lai la: %d\n", so_du-num1);
	}
 sodu( int so_du){	
  printf("so du con lai la %d\n", so_du);
}
int main()
{
	int username, x, so_tien_rut;
	int password, id, num, num1 ;
	login( username, password);
	do{
		printf("xin moi ban chon chuc nang \n1rut tien\n2chuyen tien\n3hien thi so du\n4thoat ct\n");
		printf("\n chon: ");
		scanf("%d", &x);
		switch(x)
		{
			case 1:
			withdraw(num);
			break;
			case 2 :
			transfer(id, num1);
			break;
			case 3 :
			sodu(so_du);
			case 4:
			break;	
		}
		
		printf("ban co muon tiep tuc thao tac (y/n)\n");
	    scanf("%s", &ans);
	}
	while(ans=='y');
	
	printf("ket thuc ct");
}
