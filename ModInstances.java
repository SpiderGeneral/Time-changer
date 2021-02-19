// you dont need to make this class if you already have it just add the code in it :)

public class ModInstances{

private static ModTimeChanger modTimeChanger;

public static void register(HUDManager api) {
              modTimeChanger = new ModTimeChanger();
              api.register(modTimeChanger);
    }
    
 public static ModTimeChanger getModTimeChanger) {
		return modTimeChanger;
	}   
}
   
