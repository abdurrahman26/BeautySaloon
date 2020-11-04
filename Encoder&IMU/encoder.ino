#define outputA 4
#define outputB 5

int counter =0 ;
int preState;
int curState;

void setup() {
 pinMode(outputA,INPUT);
 pinMode(outputB,INPUT);
 preState=digitalRead(outputA);

}

void loop() {
  curState=digitalRead(outputA);
  if(curState!=preState)
  {
    if(curState!=digitalRead(outputB)) counter++;
    else counter--;
  }
  preState=curState;

}
