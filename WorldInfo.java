    //replace your setWorld method in WorldInfo.java with this
    
    public void setWorldTime(long time)
    {
    	if(ModInstances.getModNightTime().isEnabled()) {
      
      //15000 Is the time for night you can put what you like here or make it changeable from a GUI
    		this.worldTime = 15000;
    	}
    	else {
    		this.worldTime = time;	
		}
        
    }
   
