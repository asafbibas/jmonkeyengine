/*
 * Copyright (c) 2003, jMonkeyEngine - Mojo Monkey Coding
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without 
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this 
 * list of conditions and the following disclaimer. 
 * 
 * Redistributions in binary form must reproduce the above copyright notice, 
 * this list of conditions and the following disclaimer in the documentation 
 * and/or other materials provided with the distribution. 
 * 
 * Neither the name of the Mojo Monkey Coding, jME, jMonkey Engine, nor the 
 * names of its contributors may be used to endorse or promote products derived 
 * from this software without specific prior written permission. 
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE 
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE 
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE 
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR 
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS 
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN 
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
 * POSSIBILITY OF SUCH DAMAGE.
 *
 */

package jme.geometry.model;

/**
 * A Vertex is a 3D point (x,y,z) along with a 2D texture map point (u,v).
 * It also knows which bone (Joint) it is associated with for animations.
 *
 * @author naj
 * @version 0.1
 */
public class Vertex {

    /**
     * The flags in MS3D.
     */
    public int flags;

    /**
     * The x value of the 3D point.
     */
    public float x;

    /**
     * The y value of the 3D point.
     */
    public float y;

    /**
     * The z value of the 3D point.
     */
    public float z;

    /**
     * The x value of the 2D texture point.
     */
    public float u;

    /**
     * The y value of the 2D texture point.
     */
    public float v;

    /**
     * The index into the array of bones (Joint) in the model.
     */
    public int boneIndex;
    
    public Vertex() {}

    /**
     * Creates a Vertex with the given 3D point and texture coordinates, as
     * well as a bone reference if used in animations.
     * @param flags the flags in MS3D.
     * @param x the x value of the 3D point.
     * @param y the y value of the 3D point.
     * @param z the z value of the 3D point.
     * @param u the x value of the 2D texture point.
     * @param v the y value of the 2D texture point.
     * @param boneIndex the index into the array of bones (Joint) in the model.
     */
    public Vertex(int flags, float x, float y, float z, float u, float v, int boneIndex) {
        this.flags = flags;
        this.x = x;
        this.y = y;
        this.z = z;
        this.u = u;
        this.v = v;
        this.boneIndex = boneIndex;
    }

}