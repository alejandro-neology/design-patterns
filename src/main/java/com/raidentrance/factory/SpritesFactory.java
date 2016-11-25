/**
 * 
 */
package com.raidentrance.factory;

import com.google.common.base.Preconditions;
import com.raidentrance.model.stripes.BadBoy;
import com.raidentrance.model.stripes.Hero;
import com.raidentrance.model.stripes.Sprite;

/**
 * @author raidentrance
 *
 */
public class SpritesFactory {
	public static enum SpriteType {
		HERO, BAD_BOY
	}

	public static Sprite createStripe(SpriteType type) {
		Preconditions.checkNotNull(type);
		switch (type) {
		case HERO:
			return new Hero();
		case BAD_BOY:
			return new BadBoy();
		}
		throw new IllegalArgumentException();
	}
}
