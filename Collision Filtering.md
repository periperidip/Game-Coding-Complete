# Block,Ignore and Overlap
---
- __Block__ -- Block physically BLOCKS an object as specified by us.
 For example- A wall will block a person.
- __Ignore__ -- Ignore will physically not hinder in the movement of our pawn/actor and will also not trigger any action in terms of code. It is like the engine doesnt even know there was a collision between two bodies.
- __Overlap__ -- Overlap will also not physically hinder in movement of our pawn/actor but will trigger an action in terms of code.
For example- when in PUBG, we are overlapping witha bush, no physical hinderance is there, but a sound of _"rustling" leaves_ is produced,like a trigger was there.

# Trace Channels and Object Channels
---
For [trace and object channel definitions](https://docs.unrealengine.com/en-US/Engine/Physics/Tracing/Overview/index.html) and for [Collision Filtering](https://www.unrealengine.com/en-US/blog/collision-filtering) follow the links.
### Trace Channel
- They are like behaviours/responses of on object to the phenomenon occuring around in the game.
For example- Trace response of a wall to a bullet is _Block_.Trace response of a wall to visibility is _Block_.
Here, __bullet__ and __visibilty__ are _Trace Channels_, colloquially the phenomenon occcuring in the game. 

### Object Channel
- When we have to trigger a behaviour in our game only for a certain object or set of objects. we specify _Object Channels_.
For example-when there is an explosion in a game, the collision event of _damage by grenade_ and the _surroundings_ tends to look for a player to give damage to.This is __Single Object Channel__.
- Here, the channels are the objects getting affected by the action of _grenade explosion_ such as the _PhysicsObjects_  are affected but the _WorldStatic_ are not.


##### IMPORTANT 
- Our mechanism tends to look at the **_least blocking_** interaction,therefore: 
  * When both ignore, the final is ignore.
  * When one ignores and the other blocks, the final is ignore (least blocking here).
  * When one Overlaps and other blocks, the final is Overlap (least blocking here). And so on...