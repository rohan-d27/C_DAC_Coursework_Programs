
struct _Point
{
	int x;
	int y;
};

typedef struct _Point Point;

init_point(Point *tmp)
{
	tmp->x = 0;
	tmp->y = 0;
}

void populate_point(Point *tmp)
{
	printf("Enter values of x & y\n");
	scanf("%d%d", &tmp->x, &tmp->y);
}

void print_point(Point tmp)
{
	printf("(%d, %d)", tmp.x, tmp.y);	
}





struct _Circle
{
	int radius;
	Point center;	
};

typedef struct _Circle Circle;

void init_circle(Circle *tmp)
{
	tmp->radius = 0;
	tmp->center->x = 0;
	tmp->center->y = 0;
}

void populate_circle(Circle *tmp)
{
	printf("Enter rad\n");
	scanf("%d%d%d", &tmp->radius);	
	populate_point(&tmp->center);
}

void print_circle(Circle tmp)
{
	printf("Circle radius=%d and Center=", tmp.radius);
	print_point(tmp.center);
	printf("\n");
}





int main()
{
	Circle c1, c2;
	init_circle(&c1);
	init_circle(&c2);
	
	//enter rad=2 and center=2,4
	populate_circle(&c1);
	print_circle(c1);
	
	//enter rad=3 and center=4,9
	populate_circle(&c2);
	print_circle(c2);
	
	if( is_intersect(c1, c2) == 1 )
	{
		printf("C1 and C2 Intersect with each other...\n");
	}
	else
	{
		printf("C1 and C2 does not intersect with each other...\n");
	}
	
	return 0;
}
