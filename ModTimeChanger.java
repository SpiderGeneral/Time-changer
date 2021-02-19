public class ModNightTime extends ModDraggable{
	
	private ScreenPosition pos;

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void render(ScreenPosition pos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(ScreenPosition pos) {
		this.pos = pos;
		
	}

	@Override
	public ScreenPosition load() {
		// TODO Auto-generated method stub
		return pos;
	}

}
