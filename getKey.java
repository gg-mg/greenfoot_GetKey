
//Using  greenfoot.getKey() from the greenfoot API
string key = greenfoot.getKey();

If (key != null)//must press key for an action to take place
{
    if (key.equals("left")){
        turn (-5);
    }
    if (key.equals("right")){
        turn (5);
    }
}

//Using  greenfoot.isKeyDown() from the greenfoot API

greenfoot.isKeyDown("left"){
    turn(-5);
}

greenfoot.isKeyDown("right"){
    turn(5);
}