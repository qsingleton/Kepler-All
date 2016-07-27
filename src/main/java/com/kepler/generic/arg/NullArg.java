package com.kepler.generic.arg;

import com.kepler.KeplerGenericException;
import com.kepler.generic.GenericArg;

/**
 * @author KimShen
 *
 */
public class NullArg implements GenericArg {

	public static final NullArg NULL = new NullArg();

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private NullArg() {

	}

	@Override
	public Object arg() throws KeplerGenericException {
		return null;
	}
}
