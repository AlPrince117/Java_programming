def insertion_sort(a)
    # write your code here
   for i in 1...(a.length)
          j=i
          while j>0
              if a[j-1]>a[j]
                  temp=a[j]
                  a[j]=a[j-1]
                  puts a.join(' ')
                  a[j-1]=temp
              else
                break
              end
              j-=1
          end
          
      end
      
      puts a.join(' ')
  end
  
  insertion_sort([1, 3, 2])
  # => 1 3 3
  #    1 2 3
  
  puts '-' * 20
  
  insertion_sort([1, 4, 6, 9, 3])
  # => 1 4 6 9 9
  #    1 4 6 6 9
  #    1 4 4 6 9
  #    1 3 4 6 9