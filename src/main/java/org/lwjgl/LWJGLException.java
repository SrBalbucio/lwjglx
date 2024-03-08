package org.lwjgl;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class LWJGLException extends Exception{

    private String message = "Unable to run anything in LWJGL.";
}
