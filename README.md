### Single-Responsibility Principle (SRP)

The **Single-Responsibility Principle** (SRP) states:

> A class should have one and only one reason to change, meaning that a class should have only one job.

#### Example

Consider an application that takes a collection of shapes—circles and squares—and calculates the sum of the area of all the shapes in the collection.

##### Shape Classes

First, create the shape classes and have the constructors set up the required parameters.

For squares, you will need to know the length of a side:

```php
class Square
{
    public $length;

    public function __construct($length)
    {
        $this->length = $length;
    }
}
```
### AreaCalculator Class

Create the `AreaCalculator` class and write the logic to sum up the areas of all provided shapes. The area of a square is calculated by `length` squared, and the area of a circle is calculated by `π` times `radius` squared.

```php
class AreaCalculator
{
    protected $shapes;

    public function __construct($shapes = [])
    {
        $this->shapes = $shapes;
    }

    public function sum()
    {
        foreach ($this->shapes as $shape) {
            if (is_a($shape, 'Square')) {
                $area[] = pow($shape->length, 2);
            } elseif (is_a($shape, 'Circle')) {
                $area[] = pi() * pow($shape->radius, 2);
            }
        }

        return array_sum($area);
    }

    public function output()
    {
        return implode('', [
            '',
            'Sum of the areas of provided shapes: ',
            $this->sum(),
            '',
        ]);
    }
}
```
