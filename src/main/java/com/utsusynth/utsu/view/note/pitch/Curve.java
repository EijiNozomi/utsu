package com.utsusynth.utsu.view.note.pitch;

import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

/** Portamento-specific wrapper for a line/curve. */
public interface Curve {
	Shape getElement();

	double getStartX();

	double getStartY();

	double getEndX();

	double getEndY();

	void bindStart(Rectangle controlPoint);

	void bindEnd(Rectangle controlPoint);

	// TODO: Make this an enum.
	String getType();
}
