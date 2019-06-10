#  //Unreal Engine
---
#### Logging
Logging helps to display a piece of text in the Output Log, done using the ```UE_LOG ``` function.

#### ```OUT``` Arguments

These are the arguments which are changed by the function and dont need an initial value to start with.

#### Pawns v/s Actors
- Pawns fall under the Actor class **(which consists of Charactors,Static Mesh actors, BSPs)**. They are controllers assigned to us by the game by default.A Pawn is the physical representation of a player or AI entity within the world.
- Actor is a huge class which has a large number of entities in it. Objects belonging to ```Actor class```  are prefixed by 'A'.Actors are any physical object present on the screen.

#### Physics Handles

They help in moving around physics objects in the game.
- _For example-_ If our Pawn has to move around a PhysicsObject(say a box),then using a physics handle with the pawn helps in maintaining the physics properties of the box even after being **"grabbed"** by the pawn i.e. the box will still be able to move objects it collides with and will behave like a massy object.

#### GetActorLocation and GetActorRotation

- ```GetActorLocation``` gives the exact location of the actor where it is in our map. Be it a pawn or any actor.
- ```GetActorRotation``` gives the geometric orientation (in space) of the pawn or the actor, the parameters (pitch,yaw and roll).
  - **NOTE-** The function ```GetPlayerViewpoint``` returns the camera angle of our viewpoint (in space) not the geometrical orientation.

