# Ray Casting
---
Ray Casting is a method of graphics rendering which is being used for decades now in games, movies, animation  etc.
- Ray Casting is different from Ray Tracing and is rather an approximate method (well, at least for many shapes) to render graphics.
- Here, we send a ray from our POV (Point Of View) i.e. the "camera" which is actually our screen, to a pixel on the screen. **It is Important to know that we are given the vertices and faces in a broken-down format _(such as in case of OpenGL or any other renderer)_ and from there we use matrix multiplication and other processes to make the image to be rendered fit for our screen.**
  - If our screen resolution is **1920x1080** then we have to send in total **2073600** i.e. 1920x1080 such rays from our POV.Now if our ray hits a point on the object which is to be rendered a colour which was to be assigned to that point is assigned to it and this is done for several other points on the object to create the final image.**_Important_- If an object is partially overlapped by another, the ray goes through the full volume and also intersects the object being overlapped yet doesn't take the latter into account as we consider only first collisions.**
    - If there is a presence of light sources in the image as well and if we want to add realism to the image, then we tend to go further in the process by taking another ray from the **above mentioned point on the object towards the direction of light** , if the angle between the incident ray and the ray mentioned here is less than 90 then the point is lit by that light and if it isnt then the point isn't lit.

- For the case when the rays incident on the viewport miss the object then that place is assigned to some other colour **(say black)** to denote _blank space or no object in our case_ 
- The process is easy for spherical objects but tougher in case of triangles because all points on a circle can be easily expressed as we know the radius but for triangles we have to use _interpolation algorithms_ involving [_barycentric coordinates_](https://en.wikipedia.org/wiki/Barycentric_coordinate_system) to find out properties such as colour, textures etc. of an arbitrary point on the triangle.
- Ray casting is an old method developed iin the 1960s and was used in games such as _Dave,Wolfenstein 3D, Duke Nukem ,etc._
- **NOTE -** The more number of pixels we have, the better the ray casting  will look.
- Videos for reference: 
   - [How Rendering Works](https://www.youtube.com/watch?v=cvcAjgMUPUA)
   - [Ray Casting Article](http://math.hws.edu/graphicsbook/c8/s1.html#advanced.1.1)
   - [Wikipedia page](https://en.wikipedia.org/wiki/Ray_casting)