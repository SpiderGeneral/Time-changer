// you dont need to make this class if you already have it just add the code in it :)

public class ModInstances{

private static ModTimeChanger modTimeChanger;

public static void register(HUDManager api) {
              modTimeChanger = new ModTimeChanger();
              api.register(modTimeChanger);
    }
    
 public static ModTimeChanger getModTimeChanger {
		return modTimeChanger;
	}   
}
   
// hi its me again this is a edit i made some mistakes in this file and some guy pointed it out :) so if you find anything please dm me on discord like that
