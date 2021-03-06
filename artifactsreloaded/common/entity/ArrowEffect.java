package archived.artifactsreloaded.common.entity;

public enum ArrowEffect {

	DEFAULT(0),
	EXPLOSIVE(1);

public final byte ID;

 ArrowEffect(int id) {
	this.ID = ((byte)id);
}

public static ArrowEffect get(byte id) {
	if ((id < 0) || (id >= values().length))
		return DEFAULT;
	return values()[id];
}
}

