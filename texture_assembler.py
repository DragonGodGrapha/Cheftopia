import os
with open('itemsList.txt') as file:
    items=file.read().splitlines()
os.chdir('.\\src\\main\\resources\\assets\\cheftopia\\models\\item')
for i in items:
    if not os.path.exists(f'{i}.json'):
        print(f'writing {i}')
        with open(f'{i}.json','w') as file:
            file.write(f'\u007b"parent": "item/generated","textures":\u007b "layer0": "cheftopia:item/{i}"\u007d\u007d')
        
print('finished')