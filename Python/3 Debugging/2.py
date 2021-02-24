import logging

logging.basicConfig(level=logging.DEBUG, format='%(asctime)s %(message)s %(levelname)s')            # necessary, to save log info into file add param : filename='abc.txt'
logging.disable(logging.CRITICAL)           # TO DISABLE DEBUG MESSAGES   ->  5 levels available

logging.debug('Start of the program')

def sum(n):
    total = 0
    for i in range(n+1):
        total += i
        logging.debug('total = %s, i= %s' % (total, i))
    return total

print(sum(10))

logging.debug('Start of the program')
