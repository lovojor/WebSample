/**
 * 
 */
package com.oncedev.view;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Lovojor
 *
 */
public class SearchMovie {
	
	@NotNull
	@Size(min=3)
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
